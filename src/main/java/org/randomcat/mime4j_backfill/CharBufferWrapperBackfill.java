/*
  This file is a version of Mime4J's CharBufferWrapper that fixes a severe bug in the ByteBufferInputStream
  (MIME4J-233): the read method would always return that it read all requested data into the array, even if it did not.

  This bug is present in Mime4J 0.8.3 and may have been fixed by the time you are reading this. In that case, you should
  update the dependency and remove this class and MBoxIteratorBackfill.
 */

package org.randomcat.mime4j_backfill;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/**
 * Wraps a CharBuffer and exposes some convenience methods to easy parse with Mime4j.
 */
public class CharBufferWrapperBackfill {

    private final CharBuffer messageBuffer;

    public CharBufferWrapperBackfill(CharBuffer messageBuffer) {
        if (messageBuffer == null) {
            throw new IllegalStateException("The buffer is null");
        }
        this.messageBuffer = messageBuffer;
    }

    public InputStream asInputStream(Charset encoding) {
        return new ByteBufferInputStream(encoding.encode(messageBuffer));
    }

    public char[] asCharArray() {
        return messageBuffer.array();
    }

    @Override
    public String toString() {
        return messageBuffer.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CharBufferWrapperBackfill)) return false;

        CharBufferWrapperBackfill that = (CharBufferWrapperBackfill) o;

        if (!messageBuffer.equals(that.messageBuffer)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return messageBuffer.hashCode();
    }

    /**
     * Provide an InputStream view over a ByteBuffer.
     */
    private static class ByteBufferInputStream extends InputStream {

        private final ByteBuffer buf;

        private ByteBufferInputStream(ByteBuffer buf) {
            this.buf = buf;
        }

        @Override
        public int read() throws IOException {
            if (!buf.hasRemaining()) {
                return -1;
            }
            return buf.get() & 0xFF;
        }

        @Override
        public int read(byte[] bytes, int off, int len) throws IOException {
            if (bytes == null) throw new NullPointerException("bytes is null");
            if (off < 0) throw new IndexOutOfBoundsException("read index negative: " + off);
            if (len < 0) throw new IndexOutOfBoundsException("read length negative: " + len);

            if (len > (bytes.length - off)) {
                throw new IndexOutOfBoundsException(
                        "read would write invalid array index: array size: " +
                                bytes.length +
                                ", array index: " +
                                off +
                                ", requested size: " +
                                len
                );
            }

            if (!buf.hasRemaining()) {
                return -1;
            }

            int actualAmount = Math.min(len, buf.remaining());
            buf.get(bytes, off, actualAmount);

            return actualAmount;
        }

    }
}

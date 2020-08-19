import java.util.*;

class AsciiCharSequence implements CharSequence  /* extends/implements */ {

    byte[] byteArray;

    public AsciiCharSequence(byte[] byteArray) {
        this.byteArray = byteArray;
    }

    // implementation
    @Override
    public int length() {
        return this.byteArray.length;
    }

    @Override
    public char charAt(int i) {
        return (char) this.byteArray[i];
    }

    @Override
    public AsciiCharSequence subSequence(int i, int i1) {
        return new AsciiCharSequence(Arrays.copyOfRange(this.byteArray, i, i1));
    }

    @Override
    public String toString() {
        return new String(byteArray);
    }
}
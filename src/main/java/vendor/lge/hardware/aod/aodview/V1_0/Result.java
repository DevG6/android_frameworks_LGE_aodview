package vendor.lge.hardware.aod.aodview.V1_0;

import java.util.ArrayList;

public final class Result {
    public static final int ERR_NO_DESC = -2;
    public static final int ERR_NO_FILE = -1;
    public static final int ERR_OPEN = -3;
    public static final int ERR_READ = -4;
    public static final int ERR_UNKNOWN = -6;
    public static final int ERR_WRITE = -5;
    public static final int OK = 0;

    public static final String toString(int o) {
        if (o == -6) {
            return "ERR_UNKNOWN";
        }
        if (o == -5) {
            return "ERR_WRITE";
        }
        if (o == -4) {
            return "ERR_READ";
        }
        if (o == -3) {
            return "ERR_OPEN";
        }
        if (o == -2) {
            return "ERR_NO_DESC";
        }
        if (o == -1) {
            return "ERR_NO_FILE";
        }
        if (o == 0) {
            return "OK";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        ArrayList<String> list = new ArrayList();
        int flipped = 0;
        if ((o & -6) == -6) {
            list.add("ERR_UNKNOWN");
            flipped = -6;
        }
        if ((o & -5) == -5) {
            list.add("ERR_WRITE");
            flipped |= -5;
        }
        if ((o & -4) == -4) {
            list.add("ERR_READ");
            flipped |= -4;
        }
        if ((o & -3) == -3) {
            list.add("ERR_OPEN");
            flipped |= -3;
        }
        if ((o & -2) == -2) {
            list.add("ERR_NO_DESC");
            flipped |= -2;
        }
        if ((o & -1) == -1) {
            list.add("ERR_NO_FILE");
            flipped |= -1;
        }
        if ((o & 0) == 0) {
            list.add("OK");
            flipped |= 0;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString((~flipped) & o));
        }
        return String.join(" | ", list);
    }
}

package vendor.lge.hardware.aod.aodview.V1_0;

import java.util.ArrayList;

public final class AodFontType {
    public static final int FONT_ANALOG = 1;
    public static final int FONT_DIGITAL = 2;
    public static final int FONT_ERROR = -1;
    public static final int FONT_MINI = 3;
    public static final int FONT_NONE = 0;

    public static final String toString(int o) {
        if (o == -1) {
            return "FONT_ERROR";
        }
        if (o == 0) {
            return "FONT_NONE";
        }
        if (o == 1) {
            return "FONT_ANALOG";
        }
        if (o == 2) {
            return "FONT_DIGITAL";
        }
        if (o == 3) {
            return "FONT_MINI";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        ArrayList<String> list = new ArrayList();
        int flipped = 0;
        if ((o & -1) == -1) {
            list.add("FONT_ERROR");
            flipped = -1;
        }
        if ((o & 0) == 0) {
            list.add("FONT_NONE");
            flipped |= 0;
        }
        if ((o & 1) == 1) {
            list.add("FONT_ANALOG");
            flipped |= 1;
        }
        if ((o & 2) == 2) {
            list.add("FONT_DIGITAL");
            flipped |= 2;
        }
        if ((o & 3) == 3) {
            list.add("FONT_MINI");
            flipped |= 3;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString((~flipped) & o));
        }
        return String.join(" | ", list);
    }
}

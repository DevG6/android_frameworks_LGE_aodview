package vendor.lge.hardware.aod.aodview.V1_0;

import android.os.HidlSupport;
import android.os.HwBlob;
import android.os.HwParcel;
import java.util.ArrayList;
import java.util.Objects;

public final class WatchFontDigitalPositionConfig {
    public int clx_pos;
    public int d_font_colonx;
    public int d_fontx;
    public int d_fonty;
    public int h10x_pos;
    public int h1x_pos;
    public int len;
    public int m10x_pos;
    public int m1x_pos;
    public int watendx;
    public int watendy;
    public int watstartx;
    public int watstarty;

    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || otherObject.getClass() != WatchFontDigitalPositionConfig.class) {
            return false;
        }
        WatchFontDigitalPositionConfig other = (WatchFontDigitalPositionConfig) otherObject;
        return this.len == other.len && this.watstartx == other.watstartx && this.watendx == other.watendx && this.watstarty == other.watstarty && this.watendy == other.watendy && this.h1x_pos == other.h1x_pos && this.h10x_pos == other.h10x_pos && this.m1x_pos == other.m1x_pos && this.m10x_pos == other.m10x_pos && this.clx_pos == other.clx_pos && this.d_fontx == other.d_fontx && this.d_fonty == other.d_fonty && this.d_font_colonx == other.d_font_colonx;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.len))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.watstartx))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.watendx))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.watstarty))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.watendy))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.h1x_pos))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.h10x_pos))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.m1x_pos))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.m10x_pos))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.clx_pos))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.d_fontx))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.d_fonty))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.d_font_colonx)))});
    }

    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".len = ");
        builder.append(this.len);
        builder.append(", .watstartx = ");
        builder.append(this.watstartx);
        builder.append(", .watendx = ");
        builder.append(this.watendx);
        builder.append(", .watstarty = ");
        builder.append(this.watstarty);
        builder.append(", .watendy = ");
        builder.append(this.watendy);
        builder.append(", .h1x_pos = ");
        builder.append(this.h1x_pos);
        builder.append(", .h10x_pos = ");
        builder.append(this.h10x_pos);
        builder.append(", .m1x_pos = ");
        builder.append(this.m1x_pos);
        builder.append(", .m10x_pos = ");
        builder.append(this.m10x_pos);
        builder.append(", .clx_pos = ");
        builder.append(this.clx_pos);
        builder.append(", .d_fontx = ");
        builder.append(this.d_fontx);
        builder.append(", .d_fonty = ");
        builder.append(this.d_fonty);
        builder.append(", .d_font_colonx = ");
        builder.append(this.d_font_colonx);
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(HwParcel parcel) {
        readEmbeddedFromParcel(parcel, parcel.readBuffer(52), 0);
    }

    public static final ArrayList<WatchFontDigitalPositionConfig> readVectorFromParcel(HwParcel parcel) {
        ArrayList<WatchFontDigitalPositionConfig> _hidl_vec = new ArrayList();
        HwBlob _hidl_blob = parcel.readBuffer(16);
        int _hidl_vec_size = _hidl_blob.getInt32(8);
        HwBlob childBlob = parcel.readEmbeddedBuffer((long) (_hidl_vec_size * 52), _hidl_blob.handle(), 0, true);
        _hidl_vec.clear();
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            WatchFontDigitalPositionConfig _hidl_vec_element = new WatchFontDigitalPositionConfig();
            _hidl_vec_element.readEmbeddedFromParcel(parcel, childBlob, (long) (_hidl_index_0 * 52));
            _hidl_vec.add(_hidl_vec_element);
        }
        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(HwParcel parcel, HwBlob _hidl_blob, long _hidl_offset) {
        this.len = _hidl_blob.getInt32(0 + _hidl_offset);
        this.watstartx = _hidl_blob.getInt32(4 + _hidl_offset);
        this.watendx = _hidl_blob.getInt32(8 + _hidl_offset);
        this.watstarty = _hidl_blob.getInt32(12 + _hidl_offset);
        this.watendy = _hidl_blob.getInt32(16 + _hidl_offset);
        this.h1x_pos = _hidl_blob.getInt32(20 + _hidl_offset);
        this.h10x_pos = _hidl_blob.getInt32(24 + _hidl_offset);
        this.m1x_pos = _hidl_blob.getInt32(28 + _hidl_offset);
        this.m10x_pos = _hidl_blob.getInt32(32 + _hidl_offset);
        this.clx_pos = _hidl_blob.getInt32(36 + _hidl_offset);
        this.d_fontx = _hidl_blob.getInt32(40 + _hidl_offset);
        this.d_fonty = _hidl_blob.getInt32(44 + _hidl_offset);
        this.d_font_colonx = _hidl_blob.getInt32(48 + _hidl_offset);
    }

    public final void writeToParcel(HwParcel parcel) {
        HwBlob _hidl_blob = new HwBlob(52);
        writeEmbeddedToBlob(_hidl_blob, 0);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(HwParcel parcel, ArrayList<WatchFontDigitalPositionConfig> _hidl_vec) {
        HwBlob _hidl_blob = new HwBlob(16);
        int _hidl_vec_size = _hidl_vec.size();
        _hidl_blob.putInt32(8, _hidl_vec_size);
        _hidl_blob.putBool(12, false);
        HwBlob childBlob = new HwBlob(_hidl_vec_size * 52);
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            ((WatchFontDigitalPositionConfig) _hidl_vec.get(_hidl_index_0)).writeEmbeddedToBlob(childBlob, (long) (_hidl_index_0 * 52));
        }
        _hidl_blob.putBlob(0, childBlob);
        parcel.writeBuffer(_hidl_blob);
    }

    public final void writeEmbeddedToBlob(HwBlob _hidl_blob, long _hidl_offset) {
        _hidl_blob.putInt32(0 + _hidl_offset, this.len);
        _hidl_blob.putInt32(4 + _hidl_offset, this.watstartx);
        _hidl_blob.putInt32(8 + _hidl_offset, this.watendx);
        _hidl_blob.putInt32(12 + _hidl_offset, this.watstarty);
        _hidl_blob.putInt32(16 + _hidl_offset, this.watendy);
        _hidl_blob.putInt32(20 + _hidl_offset, this.h1x_pos);
        _hidl_blob.putInt32(24 + _hidl_offset, this.h10x_pos);
        _hidl_blob.putInt32(28 + _hidl_offset, this.m1x_pos);
        _hidl_blob.putInt32(32 + _hidl_offset, this.m10x_pos);
        _hidl_blob.putInt32(36 + _hidl_offset, this.clx_pos);
        _hidl_blob.putInt32(40 + _hidl_offset, this.d_fontx);
        _hidl_blob.putInt32(44 + _hidl_offset, this.d_fonty);
        _hidl_blob.putInt32(48 + _hidl_offset, this.d_font_colonx);
    }
}

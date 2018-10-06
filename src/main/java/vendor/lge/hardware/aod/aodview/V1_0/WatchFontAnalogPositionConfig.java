package vendor.lge.hardware.aod.aodview.V1_0;

import android.os.HidlSupport;
import android.os.HwBlob;
import android.os.HwParcel;
import java.util.ArrayList;
import java.util.Objects;

public final class WatchFontAnalogPositionConfig {
    public int a_font_centerx;
    public int a_font_centery;
    public int a_fontx;
    public int a_fonty;
    public int a_watchcenterx;
    public int a_watchcentery;
    public int a_watstartx;
    public int a_watstarty;

    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || otherObject.getClass() != WatchFontAnalogPositionConfig.class) {
            return false;
        }
        WatchFontAnalogPositionConfig other = (WatchFontAnalogPositionConfig) otherObject;
        return this.a_watstartx == other.a_watstartx && this.a_watstarty == other.a_watstarty && this.a_watchcenterx == other.a_watchcenterx && this.a_watchcentery == other.a_watchcentery && this.a_fontx == other.a_fontx && this.a_fonty == other.a_fonty && this.a_font_centerx == other.a_font_centerx && this.a_font_centery == other.a_font_centery;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.a_watstartx))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.a_watstarty))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.a_watchcenterx))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.a_watchcentery))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.a_fontx))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.a_fonty))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.a_font_centerx))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.a_font_centery)))});
    }

    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".a_watstartx = ");
        builder.append(this.a_watstartx);
        builder.append(", .a_watstarty = ");
        builder.append(this.a_watstarty);
        builder.append(", .a_watchcenterx = ");
        builder.append(this.a_watchcenterx);
        builder.append(", .a_watchcentery = ");
        builder.append(this.a_watchcentery);
        builder.append(", .a_fontx = ");
        builder.append(this.a_fontx);
        builder.append(", .a_fonty = ");
        builder.append(this.a_fonty);
        builder.append(", .a_font_centerx = ");
        builder.append(this.a_font_centerx);
        builder.append(", .a_font_centery = ");
        builder.append(this.a_font_centery);
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(HwParcel parcel) {
        readEmbeddedFromParcel(parcel, parcel.readBuffer(32), 0);
    }

    public static final ArrayList<WatchFontAnalogPositionConfig> readVectorFromParcel(HwParcel parcel) {
        ArrayList<WatchFontAnalogPositionConfig> _hidl_vec = new ArrayList();
        HwBlob _hidl_blob = parcel.readBuffer(16);
        int _hidl_vec_size = _hidl_blob.getInt32(8);
        HwBlob childBlob = parcel.readEmbeddedBuffer((long) (_hidl_vec_size * 32), _hidl_blob.handle(), 0, true);
        _hidl_vec.clear();
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            WatchFontAnalogPositionConfig _hidl_vec_element = new WatchFontAnalogPositionConfig();
            _hidl_vec_element.readEmbeddedFromParcel(parcel, childBlob, (long) (_hidl_index_0 * 32));
            _hidl_vec.add(_hidl_vec_element);
        }
        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(HwParcel parcel, HwBlob _hidl_blob, long _hidl_offset) {
        this.a_watstartx = _hidl_blob.getInt32(0 + _hidl_offset);
        this.a_watstarty = _hidl_blob.getInt32(4 + _hidl_offset);
        this.a_watchcenterx = _hidl_blob.getInt32(8 + _hidl_offset);
        this.a_watchcentery = _hidl_blob.getInt32(12 + _hidl_offset);
        this.a_fontx = _hidl_blob.getInt32(16 + _hidl_offset);
        this.a_fonty = _hidl_blob.getInt32(20 + _hidl_offset);
        this.a_font_centerx = _hidl_blob.getInt32(24 + _hidl_offset);
        this.a_font_centery = _hidl_blob.getInt32(28 + _hidl_offset);
    }

    public final void writeToParcel(HwParcel parcel) {
        HwBlob _hidl_blob = new HwBlob(32);
        writeEmbeddedToBlob(_hidl_blob, 0);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(HwParcel parcel, ArrayList<WatchFontAnalogPositionConfig> _hidl_vec) {
        HwBlob _hidl_blob = new HwBlob(16);
        int _hidl_vec_size = _hidl_vec.size();
        _hidl_blob.putInt32(8, _hidl_vec_size);
        _hidl_blob.putBool(12, false);
        HwBlob childBlob = new HwBlob(_hidl_vec_size * 32);
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            ((WatchFontAnalogPositionConfig) _hidl_vec.get(_hidl_index_0)).writeEmbeddedToBlob(childBlob, (long) (_hidl_index_0 * 32));
        }
        _hidl_blob.putBlob(0, childBlob);
        parcel.writeBuffer(_hidl_blob);
    }

    public final void writeEmbeddedToBlob(HwBlob _hidl_blob, long _hidl_offset) {
        _hidl_blob.putInt32(0 + _hidl_offset, this.a_watstartx);
        _hidl_blob.putInt32(4 + _hidl_offset, this.a_watstarty);
        _hidl_blob.putInt32(8 + _hidl_offset, this.a_watchcenterx);
        _hidl_blob.putInt32(12 + _hidl_offset, this.a_watchcentery);
        _hidl_blob.putInt32(16 + _hidl_offset, this.a_fontx);
        _hidl_blob.putInt32(20 + _hidl_offset, this.a_fonty);
        _hidl_blob.putInt32(24 + _hidl_offset, this.a_font_centerx);
        _hidl_blob.putInt32(28 + _hidl_offset, this.a_font_centery);
    }
}

package vendor.lge.hardware.aod.aodview.V1_0;

import android.os.HidlSupport;
import android.os.HwBlob;
import android.os.HwParcel;
import java.util.ArrayList;
import java.util.Objects;

public final class WatchFontEffectConfig {
    public final WatchFontEffectBlinkConfig blink = new WatchFontEffectBlinkConfig();
    public int clock_disp_type;
    public int h24_en;
    public int len;
    public int midnight_hour_zero_en;
    public int watchon;
    public int zero_disp;

    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || otherObject.getClass() != WatchFontEffectConfig.class) {
            return false;
        }
        WatchFontEffectConfig other = (WatchFontEffectConfig) otherObject;
        return this.len == other.len && this.watchon == other.watchon && this.h24_en == other.h24_en && this.zero_disp == other.zero_disp && this.clock_disp_type == other.clock_disp_type && this.midnight_hour_zero_en == other.midnight_hour_zero_en && HidlSupport.deepEquals(this.blink, other.blink);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.len))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.watchon))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.h24_en))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.zero_disp))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.clock_disp_type))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.midnight_hour_zero_en))), Integer.valueOf(HidlSupport.deepHashCode(this.blink))});
    }

    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".len = ");
        builder.append(this.len);
        builder.append(", .watchon = ");
        builder.append(this.watchon);
        builder.append(", .h24_en = ");
        builder.append(this.h24_en);
        builder.append(", .zero_disp = ");
        builder.append(this.zero_disp);
        builder.append(", .clock_disp_type = ");
        builder.append(this.clock_disp_type);
        builder.append(", .midnight_hour_zero_en = ");
        builder.append(this.midnight_hour_zero_en);
        builder.append(", .blink = ");
        builder.append(this.blink);
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(HwParcel parcel) {
        readEmbeddedFromParcel(parcel, parcel.readBuffer(36), 0);
    }

    public static final ArrayList<WatchFontEffectConfig> readVectorFromParcel(HwParcel parcel) {
        ArrayList<WatchFontEffectConfig> _hidl_vec = new ArrayList();
        HwBlob _hidl_blob = parcel.readBuffer(16);
        int _hidl_vec_size = _hidl_blob.getInt32(8);
        HwBlob childBlob = parcel.readEmbeddedBuffer((long) (_hidl_vec_size * 36), _hidl_blob.handle(), 0, true);
        _hidl_vec.clear();
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            WatchFontEffectConfig _hidl_vec_element = new WatchFontEffectConfig();
            _hidl_vec_element.readEmbeddedFromParcel(parcel, childBlob, (long) (_hidl_index_0 * 36));
            _hidl_vec.add(_hidl_vec_element);
        }
        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(HwParcel parcel, HwBlob _hidl_blob, long _hidl_offset) {
        this.len = _hidl_blob.getInt32(0 + _hidl_offset);
        this.watchon = _hidl_blob.getInt32(4 + _hidl_offset);
        this.h24_en = _hidl_blob.getInt32(8 + _hidl_offset);
        this.zero_disp = _hidl_blob.getInt32(12 + _hidl_offset);
        this.clock_disp_type = _hidl_blob.getInt32(16 + _hidl_offset);
        this.midnight_hour_zero_en = _hidl_blob.getInt32(20 + _hidl_offset);
        this.blink.readEmbeddedFromParcel(parcel, _hidl_blob, 24 + _hidl_offset);
    }

    public final void writeToParcel(HwParcel parcel) {
        HwBlob _hidl_blob = new HwBlob(36);
        writeEmbeddedToBlob(_hidl_blob, 0);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(HwParcel parcel, ArrayList<WatchFontEffectConfig> _hidl_vec) {
        HwBlob _hidl_blob = new HwBlob(16);
        int _hidl_vec_size = _hidl_vec.size();
        _hidl_blob.putInt32(8, _hidl_vec_size);
        _hidl_blob.putBool(12, false);
        HwBlob childBlob = new HwBlob(_hidl_vec_size * 36);
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            ((WatchFontEffectConfig) _hidl_vec.get(_hidl_index_0)).writeEmbeddedToBlob(childBlob, (long) (_hidl_index_0 * 36));
        }
        _hidl_blob.putBlob(0, childBlob);
        parcel.writeBuffer(_hidl_blob);
    }

    public final void writeEmbeddedToBlob(HwBlob _hidl_blob, long _hidl_offset) {
        _hidl_blob.putInt32(0 + _hidl_offset, this.len);
        _hidl_blob.putInt32(4 + _hidl_offset, this.watchon);
        _hidl_blob.putInt32(8 + _hidl_offset, this.h24_en);
        _hidl_blob.putInt32(12 + _hidl_offset, this.zero_disp);
        _hidl_blob.putInt32(16 + _hidl_offset, this.clock_disp_type);
        _hidl_blob.putInt32(20 + _hidl_offset, this.midnight_hour_zero_en);
        this.blink.writeEmbeddedToBlob(_hidl_blob, 24 + _hidl_offset);
    }
}

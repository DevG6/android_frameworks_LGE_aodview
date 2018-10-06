package vendor.lge.hardware.aod.aodview.V1_0;

import android.os.HidlSupport;
import android.os.HwBlob;
import android.os.HwParcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public final class WatchFontPropertyConfig {
    public final WatchFontLUTConfig[] LUT = new WatchFontLUTConfig[7];
    public int len;
    public int max_num;

    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || otherObject.getClass() != WatchFontPropertyConfig.class) {
            return false;
        }
        WatchFontPropertyConfig other = (WatchFontPropertyConfig) otherObject;
        return this.len == other.len && this.max_num == other.max_num && HidlSupport.deepEquals(this.LUT, other.LUT);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.len))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.max_num))), Integer.valueOf(HidlSupport.deepHashCode(this.LUT))});
    }

    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".len = ");
        builder.append(this.len);
        builder.append(", .max_num = ");
        builder.append(this.max_num);
        builder.append(", .LUT = ");
        builder.append(Arrays.toString(this.LUT));
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(HwParcel parcel) {
        readEmbeddedFromParcel(parcel, parcel.readBuffer(92), 0);
    }

    public static final ArrayList<WatchFontPropertyConfig> readVectorFromParcel(HwParcel parcel) {
        ArrayList<WatchFontPropertyConfig> _hidl_vec = new ArrayList();
        HwBlob _hidl_blob = parcel.readBuffer(16);
        int _hidl_vec_size = _hidl_blob.getInt32(8);
        HwBlob childBlob = parcel.readEmbeddedBuffer((long) (_hidl_vec_size * 92), _hidl_blob.handle(), 0, true);
        _hidl_vec.clear();
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            WatchFontPropertyConfig _hidl_vec_element = new WatchFontPropertyConfig();
            _hidl_vec_element.readEmbeddedFromParcel(parcel, childBlob, (long) (_hidl_index_0 * 92));
            _hidl_vec.add(_hidl_vec_element);
        }
        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(HwParcel parcel, HwBlob _hidl_blob, long _hidl_offset) {
        this.len = _hidl_blob.getInt32(0 + _hidl_offset);
        this.max_num = _hidl_blob.getInt32(4 + _hidl_offset);
        long _hidl_array_offset_0 = _hidl_offset + 8;
        for (int _hidl_index_0_0 = 0; _hidl_index_0_0 < 7; _hidl_index_0_0++) {
            this.LUT[_hidl_index_0_0] = new WatchFontLUTConfig();
            this.LUT[_hidl_index_0_0].readEmbeddedFromParcel(parcel, _hidl_blob, _hidl_array_offset_0);
            _hidl_array_offset_0 += 12;
        }
    }

    public final void writeToParcel(HwParcel parcel) {
        HwBlob _hidl_blob = new HwBlob(92);
        writeEmbeddedToBlob(_hidl_blob, 0);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(HwParcel parcel, ArrayList<WatchFontPropertyConfig> _hidl_vec) {
        HwBlob _hidl_blob = new HwBlob(16);
        int _hidl_vec_size = _hidl_vec.size();
        _hidl_blob.putInt32(8, _hidl_vec_size);
        _hidl_blob.putBool(12, false);
        HwBlob childBlob = new HwBlob(_hidl_vec_size * 92);
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            ((WatchFontPropertyConfig) _hidl_vec.get(_hidl_index_0)).writeEmbeddedToBlob(childBlob, (long) (_hidl_index_0 * 92));
        }
        _hidl_blob.putBlob(0, childBlob);
        parcel.writeBuffer(_hidl_blob);
    }

    public final void writeEmbeddedToBlob(HwBlob _hidl_blob, long _hidl_offset) {
        _hidl_blob.putInt32(0 + _hidl_offset, this.len);
        _hidl_blob.putInt32(4 + _hidl_offset, this.max_num);
        long _hidl_array_offset_0 = _hidl_offset + 8;
        for (int _hidl_index_0_0 = 0; _hidl_index_0_0 < 7; _hidl_index_0_0++) {
            this.LUT[_hidl_index_0_0].writeEmbeddedToBlob(_hidl_blob, _hidl_array_offset_0);
            _hidl_array_offset_0 += 12;
        }
    }
}

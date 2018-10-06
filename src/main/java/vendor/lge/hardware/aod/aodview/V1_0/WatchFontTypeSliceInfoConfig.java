package vendor.lge.hardware.aod.aodview.V1_0;

import android.os.HidlSupport;
import android.os.HwBlob;
import android.os.HwParcel;
import java.util.ArrayList;
import java.util.Objects;

public final class WatchFontTypeSliceInfoConfig {
    public int alpha_on;
    public int font_crc_code;
    public int font_type;
    public int slice_cnt;
    public int slice_idx;
    public int total_font_size;

    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || otherObject.getClass() != WatchFontTypeSliceInfoConfig.class) {
            return false;
        }
        WatchFontTypeSliceInfoConfig other = (WatchFontTypeSliceInfoConfig) otherObject;
        return this.font_type == other.font_type && this.slice_idx == other.slice_idx && this.slice_cnt == other.slice_cnt && this.font_crc_code == other.font_crc_code && this.total_font_size == other.total_font_size && this.alpha_on == other.alpha_on;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.font_type))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.slice_idx))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.slice_cnt))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.font_crc_code))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.total_font_size))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.alpha_on)))});
    }

    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".font_type = ");
        builder.append(this.font_type);
        builder.append(", .slice_idx = ");
        builder.append(this.slice_idx);
        builder.append(", .slice_cnt = ");
        builder.append(this.slice_cnt);
        builder.append(", .font_crc_code = ");
        builder.append(this.font_crc_code);
        builder.append(", .total_font_size = ");
        builder.append(this.total_font_size);
        builder.append(", .alpha_on = ");
        builder.append(this.alpha_on);
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(HwParcel parcel) {
        readEmbeddedFromParcel(parcel, parcel.readBuffer(24), 0);
    }

    public static final ArrayList<WatchFontTypeSliceInfoConfig> readVectorFromParcel(HwParcel parcel) {
        ArrayList<WatchFontTypeSliceInfoConfig> _hidl_vec = new ArrayList();
        HwBlob _hidl_blob = parcel.readBuffer(16);
        int _hidl_vec_size = _hidl_blob.getInt32(8);
        HwBlob childBlob = parcel.readEmbeddedBuffer((long) (_hidl_vec_size * 24), _hidl_blob.handle(), 0, true);
        _hidl_vec.clear();
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            WatchFontTypeSliceInfoConfig _hidl_vec_element = new WatchFontTypeSliceInfoConfig();
            _hidl_vec_element.readEmbeddedFromParcel(parcel, childBlob, (long) (_hidl_index_0 * 24));
            _hidl_vec.add(_hidl_vec_element);
        }
        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(HwParcel parcel, HwBlob _hidl_blob, long _hidl_offset) {
        this.font_type = _hidl_blob.getInt32(0 + _hidl_offset);
        this.slice_idx = _hidl_blob.getInt32(4 + _hidl_offset);
        this.slice_cnt = _hidl_blob.getInt32(8 + _hidl_offset);
        this.font_crc_code = _hidl_blob.getInt32(12 + _hidl_offset);
        this.total_font_size = _hidl_blob.getInt32(16 + _hidl_offset);
        this.alpha_on = _hidl_blob.getInt32(20 + _hidl_offset);
    }

    public final void writeToParcel(HwParcel parcel) {
        HwBlob _hidl_blob = new HwBlob(24);
        writeEmbeddedToBlob(_hidl_blob, 0);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(HwParcel parcel, ArrayList<WatchFontTypeSliceInfoConfig> _hidl_vec) {
        HwBlob _hidl_blob = new HwBlob(16);
        int _hidl_vec_size = _hidl_vec.size();
        _hidl_blob.putInt32(8, _hidl_vec_size);
        _hidl_blob.putBool(12, false);
        HwBlob childBlob = new HwBlob(_hidl_vec_size * 24);
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            ((WatchFontTypeSliceInfoConfig) _hidl_vec.get(_hidl_index_0)).writeEmbeddedToBlob(childBlob, (long) (_hidl_index_0 * 24));
        }
        _hidl_blob.putBlob(0, childBlob);
        parcel.writeBuffer(_hidl_blob);
    }

    public final void writeEmbeddedToBlob(HwBlob _hidl_blob, long _hidl_offset) {
        _hidl_blob.putInt32(0 + _hidl_offset, this.font_type);
        _hidl_blob.putInt32(4 + _hidl_offset, this.slice_idx);
        _hidl_blob.putInt32(8 + _hidl_offset, this.slice_cnt);
        _hidl_blob.putInt32(12 + _hidl_offset, this.font_crc_code);
        _hidl_blob.putInt32(16 + _hidl_offset, this.total_font_size);
        _hidl_blob.putInt32(20 + _hidl_offset, this.alpha_on);
    }
}

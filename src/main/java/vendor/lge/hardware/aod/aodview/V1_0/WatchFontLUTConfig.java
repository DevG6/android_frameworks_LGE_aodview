package vendor.lge.hardware.aod.aodview.V1_0;

import android.os.HidlSupport;
import android.os.HwBlob;
import android.os.HwParcel;
import java.util.ArrayList;
import java.util.Objects;

public final class WatchFontLUTConfig {
    public int RGB_blue;
    public int RGB_green;
    public int RGB_red;

    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || otherObject.getClass() != WatchFontLUTConfig.class) {
            return false;
        }
        WatchFontLUTConfig other = (WatchFontLUTConfig) otherObject;
        return this.RGB_blue == other.RGB_blue && this.RGB_green == other.RGB_green && this.RGB_red == other.RGB_red;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.RGB_blue))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.RGB_green))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.RGB_red)))});
    }

    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".RGB_blue = ");
        builder.append(this.RGB_blue);
        builder.append(", .RGB_green = ");
        builder.append(this.RGB_green);
        builder.append(", .RGB_red = ");
        builder.append(this.RGB_red);
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(HwParcel parcel) {
        readEmbeddedFromParcel(parcel, parcel.readBuffer(12), 0);
    }

    public static final ArrayList<WatchFontLUTConfig> readVectorFromParcel(HwParcel parcel) {
        ArrayList<WatchFontLUTConfig> _hidl_vec = new ArrayList();
        HwBlob _hidl_blob = parcel.readBuffer(16);
        int _hidl_vec_size = _hidl_blob.getInt32(8);
        HwBlob childBlob = parcel.readEmbeddedBuffer((long) (_hidl_vec_size * 12), _hidl_blob.handle(), 0, true);
        _hidl_vec.clear();
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            WatchFontLUTConfig _hidl_vec_element = new WatchFontLUTConfig();
            _hidl_vec_element.readEmbeddedFromParcel(parcel, childBlob, (long) (_hidl_index_0 * 12));
            _hidl_vec.add(_hidl_vec_element);
        }
        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(HwParcel parcel, HwBlob _hidl_blob, long _hidl_offset) {
        this.RGB_blue = _hidl_blob.getInt32(0 + _hidl_offset);
        this.RGB_green = _hidl_blob.getInt32(4 + _hidl_offset);
        this.RGB_red = _hidl_blob.getInt32(8 + _hidl_offset);
    }

    public final void writeToParcel(HwParcel parcel) {
        HwBlob _hidl_blob = new HwBlob(12);
        writeEmbeddedToBlob(_hidl_blob, 0);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(HwParcel parcel, ArrayList<WatchFontLUTConfig> _hidl_vec) {
        HwBlob _hidl_blob = new HwBlob(16);
        int _hidl_vec_size = _hidl_vec.size();
        _hidl_blob.putInt32(8, _hidl_vec_size);
        _hidl_blob.putBool(12, false);
        HwBlob childBlob = new HwBlob(_hidl_vec_size * 12);
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            ((WatchFontLUTConfig) _hidl_vec.get(_hidl_index_0)).writeEmbeddedToBlob(childBlob, (long) (_hidl_index_0 * 12));
        }
        _hidl_blob.putBlob(0, childBlob);
        parcel.writeBuffer(_hidl_blob);
    }

    public final void writeEmbeddedToBlob(HwBlob _hidl_blob, long _hidl_offset) {
        _hidl_blob.putInt32(0 + _hidl_offset, this.RGB_blue);
        _hidl_blob.putInt32(4 + _hidl_offset, this.RGB_green);
        _hidl_blob.putInt32(8 + _hidl_offset, this.RGB_red);
    }
}

package vendor.lge.hardware.aod.aodview.V1_0;

import android.os.HidlSupport;
import android.os.HwBlob;
import android.os.HwParcel;
import java.util.ArrayList;
import java.util.Objects;

public final class WatchTimeSyncConfig {
    public int len;
    public int rtc_cwhour;
    public int rtc_cwmilli;
    public int rtc_cwmin;
    public int rtc_cwsec;

    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || otherObject.getClass() != WatchTimeSyncConfig.class) {
            return false;
        }
        WatchTimeSyncConfig other = (WatchTimeSyncConfig) otherObject;
        return this.len == other.len && this.rtc_cwhour == other.rtc_cwhour && this.rtc_cwmin == other.rtc_cwmin && this.rtc_cwsec == other.rtc_cwsec && this.rtc_cwmilli == other.rtc_cwmilli;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.len))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.rtc_cwhour))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.rtc_cwmin))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.rtc_cwsec))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.rtc_cwmilli)))});
    }

    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".len = ");
        builder.append(this.len);
        builder.append(", .rtc_cwhour = ");
        builder.append(this.rtc_cwhour);
        builder.append(", .rtc_cwmin = ");
        builder.append(this.rtc_cwmin);
        builder.append(", .rtc_cwsec = ");
        builder.append(this.rtc_cwsec);
        builder.append(", .rtc_cwmilli = ");
        builder.append(this.rtc_cwmilli);
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(HwParcel parcel) {
        readEmbeddedFromParcel(parcel, parcel.readBuffer(20), 0);
    }

    public static final ArrayList<WatchTimeSyncConfig> readVectorFromParcel(HwParcel parcel) {
        ArrayList<WatchTimeSyncConfig> _hidl_vec = new ArrayList();
        HwBlob _hidl_blob = parcel.readBuffer(16);
        int _hidl_vec_size = _hidl_blob.getInt32(8);
        HwBlob childBlob = parcel.readEmbeddedBuffer((long) (_hidl_vec_size * 20), _hidl_blob.handle(), 0, true);
        _hidl_vec.clear();
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            WatchTimeSyncConfig _hidl_vec_element = new WatchTimeSyncConfig();
            _hidl_vec_element.readEmbeddedFromParcel(parcel, childBlob, (long) (_hidl_index_0 * 20));
            _hidl_vec.add(_hidl_vec_element);
        }
        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(HwParcel parcel, HwBlob _hidl_blob, long _hidl_offset) {
        this.len = _hidl_blob.getInt32(0 + _hidl_offset);
        this.rtc_cwhour = _hidl_blob.getInt32(4 + _hidl_offset);
        this.rtc_cwmin = _hidl_blob.getInt32(8 + _hidl_offset);
        this.rtc_cwsec = _hidl_blob.getInt32(12 + _hidl_offset);
        this.rtc_cwmilli = _hidl_blob.getInt32(16 + _hidl_offset);
    }

    public final void writeToParcel(HwParcel parcel) {
        HwBlob _hidl_blob = new HwBlob(20);
        writeEmbeddedToBlob(_hidl_blob, 0);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(HwParcel parcel, ArrayList<WatchTimeSyncConfig> _hidl_vec) {
        HwBlob _hidl_blob = new HwBlob(16);
        int _hidl_vec_size = _hidl_vec.size();
        _hidl_blob.putInt32(8, _hidl_vec_size);
        _hidl_blob.putBool(12, false);
        HwBlob childBlob = new HwBlob(_hidl_vec_size * 20);
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            ((WatchTimeSyncConfig) _hidl_vec.get(_hidl_index_0)).writeEmbeddedToBlob(childBlob, (long) (_hidl_index_0 * 20));
        }
        _hidl_blob.putBlob(0, childBlob);
        parcel.writeBuffer(_hidl_blob);
    }

    public final void writeEmbeddedToBlob(HwBlob _hidl_blob, long _hidl_offset) {
        _hidl_blob.putInt32(0 + _hidl_offset, this.len);
        _hidl_blob.putInt32(4 + _hidl_offset, this.rtc_cwhour);
        _hidl_blob.putInt32(8 + _hidl_offset, this.rtc_cwmin);
        _hidl_blob.putInt32(12 + _hidl_offset, this.rtc_cwsec);
        _hidl_blob.putInt32(16 + _hidl_offset, this.rtc_cwmilli);
    }
}

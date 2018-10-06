package vendor.lge.hardware.aod.aodview.V1_0;

import android.os.HidlSupport;
import android.os.HwBlob;
import android.os.HwParcel;
import java.util.ArrayList;
import java.util.Objects;

public final class WatchFontPositionConfig {
    public int FontType;
    public final WatchFontAnalogPositionConfig WatchAnalog = new WatchFontAnalogPositionConfig();
    public final WatchFontDigitalPositionConfig WatchDigital = new WatchFontDigitalPositionConfig();

    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || otherObject.getClass() != WatchFontPositionConfig.class) {
            return false;
        }
        WatchFontPositionConfig other = (WatchFontPositionConfig) otherObject;
        return this.FontType == other.FontType && HidlSupport.deepEquals(this.WatchDigital, other.WatchDigital) && HidlSupport.deepEquals(this.WatchAnalog, other.WatchAnalog);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.FontType))), Integer.valueOf(HidlSupport.deepHashCode(this.WatchDigital)), Integer.valueOf(HidlSupport.deepHashCode(this.WatchAnalog))});
    }

    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".FontType = ");
        builder.append(AodFontType.toString(this.FontType));
        builder.append(", .WatchDigital = ");
        builder.append(this.WatchDigital);
        builder.append(", .WatchAnalog = ");
        builder.append(this.WatchAnalog);
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(HwParcel parcel) {
        readEmbeddedFromParcel(parcel, parcel.readBuffer(88), 0);
    }

    public static final ArrayList<WatchFontPositionConfig> readVectorFromParcel(HwParcel parcel) {
        ArrayList<WatchFontPositionConfig> _hidl_vec = new ArrayList();
        HwBlob _hidl_blob = parcel.readBuffer(16);
        int _hidl_vec_size = _hidl_blob.getInt32(8);
        HwBlob childBlob = parcel.readEmbeddedBuffer((long) (_hidl_vec_size * 88), _hidl_blob.handle(), 0, true);
        _hidl_vec.clear();
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            WatchFontPositionConfig _hidl_vec_element = new WatchFontPositionConfig();
            _hidl_vec_element.readEmbeddedFromParcel(parcel, childBlob, (long) (_hidl_index_0 * 88));
            _hidl_vec.add(_hidl_vec_element);
        }
        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(HwParcel parcel, HwBlob _hidl_blob, long _hidl_offset) {
        this.FontType = _hidl_blob.getInt32(0 + _hidl_offset);
        this.WatchDigital.readEmbeddedFromParcel(parcel, _hidl_blob, 4 + _hidl_offset);
        this.WatchAnalog.readEmbeddedFromParcel(parcel, _hidl_blob, 56 + _hidl_offset);
    }

    public final void writeToParcel(HwParcel parcel) {
        HwBlob _hidl_blob = new HwBlob(88);
        writeEmbeddedToBlob(_hidl_blob, 0);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(HwParcel parcel, ArrayList<WatchFontPositionConfig> _hidl_vec) {
        HwBlob _hidl_blob = new HwBlob(16);
        int _hidl_vec_size = _hidl_vec.size();
        _hidl_blob.putInt32(8, _hidl_vec_size);
        _hidl_blob.putBool(12, false);
        HwBlob childBlob = new HwBlob(_hidl_vec_size * 88);
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            ((WatchFontPositionConfig) _hidl_vec.get(_hidl_index_0)).writeEmbeddedToBlob(childBlob, (long) (_hidl_index_0 * 88));
        }
        _hidl_blob.putBlob(0, childBlob);
        parcel.writeBuffer(_hidl_blob);
    }

    public final void writeEmbeddedToBlob(HwBlob _hidl_blob, long _hidl_offset) {
        _hidl_blob.putInt32(0 + _hidl_offset, this.FontType);
        this.WatchDigital.writeEmbeddedToBlob(_hidl_blob, 4 + _hidl_offset);
        this.WatchAnalog.writeEmbeddedToBlob(_hidl_blob, 56 + _hidl_offset);
    }
}

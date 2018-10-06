package vendor.lge.hardware.aod.aodview.V1_0;

import android.os.HidlSupport;
import android.os.HwBlob;
import android.os.HwParcel;
import java.util.ArrayList;
import java.util.Objects;

public final class MarqueeModeConfig {
    public int mq_direction;
    public int mq_mode;
    public int mq_speed;
    public final mq_pos pos = new mq_pos();

    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || otherObject.getClass() != MarqueeModeConfig.class) {
            return false;
        }
        MarqueeModeConfig other = (MarqueeModeConfig) otherObject;
        return this.mq_mode == other.mq_mode && this.mq_direction == other.mq_direction && this.mq_speed == other.mq_speed && HidlSupport.deepEquals(this.pos, other.pos);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.mq_mode))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.mq_direction))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.mq_speed))), Integer.valueOf(HidlSupport.deepHashCode(this.pos))});
    }

    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".mq_mode = ");
        builder.append(this.mq_mode);
        builder.append(", .mq_direction = ");
        builder.append(this.mq_direction);
        builder.append(", .mq_speed = ");
        builder.append(this.mq_speed);
        builder.append(", .pos = ");
        builder.append(this.pos);
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(HwParcel parcel) {
        readEmbeddedFromParcel(parcel, parcel.readBuffer(28), 0);
    }

    public static final ArrayList<MarqueeModeConfig> readVectorFromParcel(HwParcel parcel) {
        ArrayList<MarqueeModeConfig> _hidl_vec = new ArrayList();
        HwBlob _hidl_blob = parcel.readBuffer(16);
        int _hidl_vec_size = _hidl_blob.getInt32(8);
        HwBlob childBlob = parcel.readEmbeddedBuffer((long) (_hidl_vec_size * 28), _hidl_blob.handle(), 0, true);
        _hidl_vec.clear();
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            MarqueeModeConfig _hidl_vec_element = new MarqueeModeConfig();
            _hidl_vec_element.readEmbeddedFromParcel(parcel, childBlob, (long) (_hidl_index_0 * 28));
            _hidl_vec.add(_hidl_vec_element);
        }
        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(HwParcel parcel, HwBlob _hidl_blob, long _hidl_offset) {
        this.mq_mode = _hidl_blob.getInt32(0 + _hidl_offset);
        this.mq_direction = _hidl_blob.getInt32(4 + _hidl_offset);
        this.mq_speed = _hidl_blob.getInt32(8 + _hidl_offset);
        this.pos.readEmbeddedFromParcel(parcel, _hidl_blob, 12 + _hidl_offset);
    }

    public final void writeToParcel(HwParcel parcel) {
        HwBlob _hidl_blob = new HwBlob(28);
        writeEmbeddedToBlob(_hidl_blob, 0);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(HwParcel parcel, ArrayList<MarqueeModeConfig> _hidl_vec) {
        HwBlob _hidl_blob = new HwBlob(16);
        int _hidl_vec_size = _hidl_vec.size();
        _hidl_blob.putInt32(8, _hidl_vec_size);
        _hidl_blob.putBool(12, false);
        HwBlob childBlob = new HwBlob(_hidl_vec_size * 28);
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            ((MarqueeModeConfig) _hidl_vec.get(_hidl_index_0)).writeEmbeddedToBlob(childBlob, (long) (_hidl_index_0 * 28));
        }
        _hidl_blob.putBlob(0, childBlob);
        parcel.writeBuffer(_hidl_blob);
    }

    public final void writeEmbeddedToBlob(HwBlob _hidl_blob, long _hidl_offset) {
        _hidl_blob.putInt32(0 + _hidl_offset, this.mq_mode);
        _hidl_blob.putInt32(4 + _hidl_offset, this.mq_direction);
        _hidl_blob.putInt32(8 + _hidl_offset, this.mq_speed);
        this.pos.writeEmbeddedToBlob(_hidl_blob, 12 + _hidl_offset);
    }
}

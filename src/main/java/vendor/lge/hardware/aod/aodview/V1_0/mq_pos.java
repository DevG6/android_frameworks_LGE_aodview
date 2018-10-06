package vendor.lge.hardware.aod.aodview.V1_0;

import android.os.HidlSupport;
import android.os.HwBlob;
import android.os.HwParcel;
import java.util.ArrayList;
import java.util.Objects;

public final class mq_pos {
    public int end_x;
    public int end_y;
    public int start_x;
    public int start_y;

    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || otherObject.getClass() != mq_pos.class) {
            return false;
        }
        mq_pos other = (mq_pos) otherObject;
        return this.start_x == other.start_x && this.end_x == other.end_x && this.start_y == other.start_y && this.end_y == other.end_y;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.start_x))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.end_x))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.start_y))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.end_y)))});
    }

    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".start_x = ");
        builder.append(this.start_x);
        builder.append(", .end_x = ");
        builder.append(this.end_x);
        builder.append(", .start_y = ");
        builder.append(this.start_y);
        builder.append(", .end_y = ");
        builder.append(this.end_y);
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(HwParcel parcel) {
        readEmbeddedFromParcel(parcel, parcel.readBuffer(16), 0);
    }

    public static final ArrayList<mq_pos> readVectorFromParcel(HwParcel parcel) {
        ArrayList<mq_pos> _hidl_vec = new ArrayList();
        HwBlob _hidl_blob = parcel.readBuffer(16);
        int _hidl_vec_size = _hidl_blob.getInt32(8);
        HwBlob childBlob = parcel.readEmbeddedBuffer((long) (_hidl_vec_size * 16), _hidl_blob.handle(), 0, true);
        _hidl_vec.clear();
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            mq_pos _hidl_vec_element = new mq_pos();
            _hidl_vec_element.readEmbeddedFromParcel(parcel, childBlob, (long) (_hidl_index_0 * 16));
            _hidl_vec.add(_hidl_vec_element);
        }
        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(HwParcel parcel, HwBlob _hidl_blob, long _hidl_offset) {
        this.start_x = _hidl_blob.getInt32(0 + _hidl_offset);
        this.end_x = _hidl_blob.getInt32(4 + _hidl_offset);
        this.start_y = _hidl_blob.getInt32(8 + _hidl_offset);
        this.end_y = _hidl_blob.getInt32(12 + _hidl_offset);
    }

    public final void writeToParcel(HwParcel parcel) {
        HwBlob _hidl_blob = new HwBlob(16);
        writeEmbeddedToBlob(_hidl_blob, 0);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(HwParcel parcel, ArrayList<mq_pos> _hidl_vec) {
        HwBlob _hidl_blob = new HwBlob(16);
        int _hidl_vec_size = _hidl_vec.size();
        _hidl_blob.putInt32(8, _hidl_vec_size);
        _hidl_blob.putBool(12, false);
        HwBlob childBlob = new HwBlob(_hidl_vec_size * 16);
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            ((mq_pos) _hidl_vec.get(_hidl_index_0)).writeEmbeddedToBlob(childBlob, (long) (_hidl_index_0 * 16));
        }
        _hidl_blob.putBlob(0, childBlob);
        parcel.writeBuffer(_hidl_blob);
    }

    public final void writeEmbeddedToBlob(HwBlob _hidl_blob, long _hidl_offset) {
        _hidl_blob.putInt32(0 + _hidl_offset, this.start_x);
        _hidl_blob.putInt32(4 + _hidl_offset, this.end_x);
        _hidl_blob.putInt32(8 + _hidl_offset, this.start_y);
        _hidl_blob.putInt32(12 + _hidl_offset, this.end_y);
    }
}

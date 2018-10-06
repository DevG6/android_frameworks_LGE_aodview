package vendor.lge.hardware.aod.aodview.V1_0;

import android.hidl.base.V1_0.DebugInfo;
import android.hidl.base.V1_0.IBase;
import android.os.HwBinder;
import android.os.HwBlob;
import android.os.HwParcel;
import android.os.IHwBinder;
import android.os.IHwBinder.DeathRecipient;
import android.os.IHwInterface;
import android.os.RemoteException;
import android.os.SystemProperties;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public interface IAodView extends IBase {
    public static final String kInterfaceName = "vendor.lge.hardware.aod.aodview@1.0::IAodView";

    public static final class Proxy implements IAodView {
        private IHwBinder mRemote;

        public Proxy(IHwBinder remote) {
            this.mRemote = (IHwBinder) Objects.requireNonNull(remote);
        }

        public IHwBinder asBinder() {
            return this.mRemote;
        }

        public String toString() {
            try {
                return interfaceDescriptor() + "@Proxy";
            } catch (RemoteException e) {
                return "[class or subclass of vendor.lge.hardware.aod.aodview@1.0::IAodView]@Proxy";
            }
        }

        public int setFontEffect(WatchFontEffectConfig effect) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodView.kInterfaceName);
            effect.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(1, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                int _hidl_out_err = _hidl_reply.readInt32();
                return _hidl_out_err;
            } finally {
                _hidl_reply.release();
            }
        }

        public void getFontEnable(getFontEnableCallback _hidl_cb) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodView.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(2, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                _hidl_cb.onValues(_hidl_reply.readInt32(), _hidl_reply.readBool());
            } finally {
                _hidl_reply.release();
            }
        }

        public int setFontEnable(boolean enable) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodView.kInterfaceName);
            _hidl_request.writeBool(enable);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(3, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                int _hidl_out_err = _hidl_reply.readInt32();
                return _hidl_out_err;
            } finally {
                _hidl_reply.release();
            }
        }

        public int setFontPosition(WatchFontPositionConfig position) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodView.kInterfaceName);
            position.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(4, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                int _hidl_out_err = _hidl_reply.readInt32();
                return _hidl_out_err;
            } finally {
                _hidl_reply.release();
            }
        }

        public int setFontProperty(WatchFontPropertyConfig property) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodView.kInterfaceName);
            property.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(5, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                int _hidl_out_err = _hidl_reply.readInt32();
                return _hidl_out_err;
            } finally {
                _hidl_reply.release();
            }
        }

        public int setTimeSync(WatchTimeSyncConfig time) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodView.kInterfaceName);
            time.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(6, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                int _hidl_out_err = _hidl_reply.readInt32();
                return _hidl_out_err;
            } finally {
                _hidl_reply.release();
            }
        }

        public void getFontType(getFontTypeCallback _hidl_cb) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodView.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(7, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                _hidl_cb.onValues(_hidl_reply.readInt32(), _hidl_reply.readInt32());
            } finally {
                _hidl_reply.release();
            }
        }

        public int setFontType(WatchFontTypeSliceInfoConfig fontdata) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodView.kInterfaceName);
            fontdata.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(8, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                int _hidl_out_err = _hidl_reply.readInt32();
                return _hidl_out_err;
            } finally {
                _hidl_reply.release();
            }
        }

        public void getMqMode(getMqModeCallback _hidl_cb) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodView.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(9, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                int _hidl_out_err = _hidl_reply.readInt32();
                MarqueeModeConfig _hidl_out_mode = new MarqueeModeConfig();
                _hidl_out_mode.readFromParcel(_hidl_reply);
                _hidl_cb.onValues(_hidl_out_err, _hidl_out_mode);
            } finally {
                _hidl_reply.release();
            }
        }

        public int setMqMode(MarqueeModeConfig MqMode) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodView.kInterfaceName);
            MqMode.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(10, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                int _hidl_out_err = _hidl_reply.readInt32();
                return _hidl_out_err;
            } finally {
                _hidl_reply.release();
            }
        }

        public ArrayList<String> interfaceChain() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken("android.hidl.base@1.0::IBase");
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256067662, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                ArrayList<String> _hidl_out_descriptors = _hidl_reply.readStringVector();
                return _hidl_out_descriptors;
            } finally {
                _hidl_reply.release();
            }
        }

        public String interfaceDescriptor() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken("android.hidl.base@1.0::IBase");
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256136003, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                String _hidl_out_descriptor = _hidl_reply.readString();
                return _hidl_out_descriptor;
            } finally {
                _hidl_reply.release();
            }
        }

        public ArrayList<byte[]> getHashChain() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken("android.hidl.base@1.0::IBase");
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256398152, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                ArrayList<byte[]> _hidl_out_hashchain = new ArrayList();
                HwBlob _hidl_blob = _hidl_reply.readBuffer(16);
                int _hidl_vec_size = _hidl_blob.getInt32(8);
                HwBlob childBlob = _hidl_reply.readEmbeddedBuffer((long) (_hidl_vec_size * 32), _hidl_blob.handle(), 0, true);
                _hidl_out_hashchain.clear();
                for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
                    Object _hidl_vec_element = new byte[32];
                    long _hidl_array_offset_1 = (long) (_hidl_index_0 * 32);
                    for (int _hidl_index_1_0 = 0; _hidl_index_1_0 < 32; _hidl_index_1_0++) {
                        _hidl_vec_element[_hidl_index_1_0] = childBlob.getInt8(_hidl_array_offset_1);
                        _hidl_array_offset_1++;
                    }
                    _hidl_out_hashchain.add(_hidl_vec_element);
                }
                return _hidl_out_hashchain;
            } finally {
                _hidl_reply.release();
            }
        }

        public void setHALInstrumentation() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken("android.hidl.base@1.0::IBase");
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256462420, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public boolean linkToDeath(DeathRecipient recipient, long cookie) throws RemoteException {
            return this.mRemote.linkToDeath(recipient, cookie);
        }

        public void ping() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken("android.hidl.base@1.0::IBase");
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256921159, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public DebugInfo getDebugInfo() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken("android.hidl.base@1.0::IBase");
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(257049926, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                DebugInfo _hidl_out_info = new DebugInfo();
                _hidl_out_info.readFromParcel(_hidl_reply);
                return _hidl_out_info;
            } finally {
                _hidl_reply.release();
            }
        }

        public void notifySyspropsChanged() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken("android.hidl.base@1.0::IBase");
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(257120595, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public boolean unlinkToDeath(DeathRecipient recipient) throws RemoteException {
            return this.mRemote.unlinkToDeath(recipient);
        }
    }

    public interface getFontEnableCallback {
        void onValues(int i, boolean z);
    }

    public interface getFontTypeCallback {
        void onValues(int i, int i2);
    }

    public interface getMqModeCallback {
        void onValues(int i, MarqueeModeConfig marqueeModeConfig);
    }

    public static abstract class Stub extends HwBinder implements IAodView {
        public IHwBinder asBinder() {
            return this;
        }

        public final ArrayList<String> interfaceChain() {
            return new ArrayList(Arrays.asList(new String[]{IAodView.kInterfaceName, "android.hidl.base@1.0::IBase"}));
        }

        public final String interfaceDescriptor() {
            return IAodView.kInterfaceName;
        }

        public final ArrayList<byte[]> getHashChain() {
            return new ArrayList(Arrays.asList(new byte[][]{new byte[]{(byte) 90, (byte) -67, (byte) 71, (byte) 43, (byte) 0, (byte) 126, (byte) 39, (byte) 18, (byte) -17, (byte) -94, (byte) 29, (byte) -55, (byte) 17, (byte) -127, (byte) 1, (byte) -13, (byte) -117, (byte) -105, (byte) -120, (byte) -59, (byte) 82, (byte) -22, (byte) 8, (byte) -70, (byte) -106, (byte) 76, (byte) -19, (byte) -4, (byte) -11, (byte) -45, (byte) -60, (byte) -71}, new byte[]{(byte) -67, (byte) -38, (byte) -74, (byte) 24, (byte) 77, (byte) 122, (byte) 52, (byte) 109, (byte) -90, (byte) -96, (byte) 125, (byte) -64, (byte) -126, (byte) -116, (byte) -15, (byte) -102, (byte) 105, (byte) 111, (byte) 76, (byte) -86, (byte) 54, (byte) 17, (byte) -59, (byte) 31, (byte) 46, (byte) 20, (byte) 86, (byte) 90, (byte) 20, (byte) -76, (byte) 15, (byte) -39}}));
        }

        public final void setHALInstrumentation() {
        }

        public final boolean linkToDeath(DeathRecipient recipient, long cookie) {
            return true;
        }

        public final void ping() {
        }

        public final DebugInfo getDebugInfo() {
            DebugInfo info = new DebugInfo();
            info.pid = -1;
            info.ptr = 0;
            info.arch = 0;
            return info;
        }

        public final void notifySyspropsChanged() {
            SystemProperties.reportSyspropChanged();
        }

        public final boolean unlinkToDeath(DeathRecipient recipient) {
            return true;
        }

        public IHwInterface queryLocalInterface(String descriptor) {
            if (IAodView.kInterfaceName.equals(descriptor)) {
                return this;
            }
            return null;
        }

        public void registerAsService(String serviceName) throws RemoteException {
            registerService(serviceName);
        }

        public String toString() {
            return interfaceDescriptor() + "@Stub";
        }

        public void onTransact(int _hidl_code, HwParcel _hidl_request, HwParcel _hidl_reply, int _hidl_flags) throws RemoteException {
            int _hidl_out_err;
            final HwParcel hwParcel;
            switch (_hidl_code) {
                case AodFontType.FONT_ANALOG /*1*/:
                    _hidl_request.enforceInterface(IAodView.kInterfaceName);
                    WatchFontEffectConfig effect = new WatchFontEffectConfig();
                    effect.readFromParcel(_hidl_request);
                    _hidl_out_err = setFontEffect(effect);
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeInt32(_hidl_out_err);
                    _hidl_reply.send();
                    return;
                case AodFontType.FONT_DIGITAL /*2*/:
                    _hidl_request.enforceInterface(IAodView.kInterfaceName);
                    hwParcel = _hidl_reply;
                    getFontEnable(new getFontEnableCallback() {
                        public void onValues(int err, boolean enable) {
                            hwParcel.writeStatus(0);
                            hwParcel.writeInt32(err);
                            hwParcel.writeBool(enable);
                            hwParcel.send();
                        }
                    });
                    return;
                case AodFontType.FONT_MINI /*3*/:
                    _hidl_request.enforceInterface(IAodView.kInterfaceName);
                    _hidl_out_err = setFontEnable(_hidl_request.readBool());
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeInt32(_hidl_out_err);
                    _hidl_reply.send();
                    return;
                case 4:
                    _hidl_request.enforceInterface(IAodView.kInterfaceName);
                    WatchFontPositionConfig position = new WatchFontPositionConfig();
                    position.readFromParcel(_hidl_request);
                    _hidl_out_err = setFontPosition(position);
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeInt32(_hidl_out_err);
                    _hidl_reply.send();
                    return;
                case 5:
                    _hidl_request.enforceInterface(IAodView.kInterfaceName);
                    WatchFontPropertyConfig property = new WatchFontPropertyConfig();
                    property.readFromParcel(_hidl_request);
                    _hidl_out_err = setFontProperty(property);
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeInt32(_hidl_out_err);
                    _hidl_reply.send();
                    return;
                case 6:
                    _hidl_request.enforceInterface(IAodView.kInterfaceName);
                    WatchTimeSyncConfig time = new WatchTimeSyncConfig();
                    time.readFromParcel(_hidl_request);
                    _hidl_out_err = setTimeSync(time);
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeInt32(_hidl_out_err);
                    _hidl_reply.send();
                    return;
                case 7:
                    _hidl_request.enforceInterface(IAodView.kInterfaceName);
                    hwParcel = _hidl_reply;
                    getFontType(new getFontTypeCallback() {
                        public void onValues(int err, int type) {
                            hwParcel.writeStatus(0);
                            hwParcel.writeInt32(err);
                            hwParcel.writeInt32(type);
                            hwParcel.send();
                        }
                    });
                    return;
                case 8:
                    _hidl_request.enforceInterface(IAodView.kInterfaceName);
                    WatchFontTypeSliceInfoConfig fontdata = new WatchFontTypeSliceInfoConfig();
                    fontdata.readFromParcel(_hidl_request);
                    _hidl_out_err = setFontType(fontdata);
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeInt32(_hidl_out_err);
                    _hidl_reply.send();
                    return;
                case 9:
                    _hidl_request.enforceInterface(IAodView.kInterfaceName);
                    hwParcel = _hidl_reply;
                    getMqMode(new getMqModeCallback() {
                        public void onValues(int err, MarqueeModeConfig mode) {
                            hwParcel.writeStatus(0);
                            hwParcel.writeInt32(err);
                            mode.writeToParcel(hwParcel);
                            hwParcel.send();
                        }
                    });
                    return;
                case 10:
                    _hidl_request.enforceInterface(IAodView.kInterfaceName);
                    MarqueeModeConfig MqMode = new MarqueeModeConfig();
                    MqMode.readFromParcel(_hidl_request);
                    _hidl_out_err = setMqMode(MqMode);
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeInt32(_hidl_out_err);
                    _hidl_reply.send();
                    return;
                case 256067662:
                    _hidl_request.enforceInterface("android.hidl.base@1.0::IBase");
                    ArrayList<String> _hidl_out_descriptors = interfaceChain();
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeStringVector(_hidl_out_descriptors);
                    _hidl_reply.send();
                    return;
                case 256131655:
                    _hidl_request.enforceInterface("android.hidl.base@1.0::IBase");
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.send();
                    return;
                case 256136003:
                    _hidl_request.enforceInterface("android.hidl.base@1.0::IBase");
                    String _hidl_out_descriptor = interfaceDescriptor();
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeString(_hidl_out_descriptor);
                    _hidl_reply.send();
                    return;
                case 256398152:
                    _hidl_request.enforceInterface("android.hidl.base@1.0::IBase");
                    ArrayList<byte[]> _hidl_out_hashchain = getHashChain();
                    _hidl_reply.writeStatus(0);
                    HwBlob _hidl_blob = new HwBlob(16);
                    int _hidl_vec_size = _hidl_out_hashchain.size();
                    _hidl_blob.putInt32(8, _hidl_vec_size);
                    _hidl_blob.putBool(12, false);
                    HwBlob hwBlob = new HwBlob(_hidl_vec_size * 32);
                    for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
                        long _hidl_array_offset_1 = (long) (_hidl_index_0 * 32);
                        for (int _hidl_index_1_0 = 0; _hidl_index_1_0 < 32; _hidl_index_1_0++) {
                            hwBlob.putInt8(_hidl_array_offset_1, ((byte[]) _hidl_out_hashchain.get(_hidl_index_0))[_hidl_index_1_0]);
                            _hidl_array_offset_1++;
                        }
                    }
                    _hidl_blob.putBlob(0, hwBlob);
                    _hidl_reply.writeBuffer(_hidl_blob);
                    _hidl_reply.send();
                    return;
                case 256462420:
                    _hidl_request.enforceInterface("android.hidl.base@1.0::IBase");
                    setHALInstrumentation();
                    return;
                case 257049926:
                    _hidl_request.enforceInterface("android.hidl.base@1.0::IBase");
                    DebugInfo _hidl_out_info = getDebugInfo();
                    _hidl_reply.writeStatus(0);
                    _hidl_out_info.writeToParcel(_hidl_reply);
                    _hidl_reply.send();
                    return;
                case 257120595:
                    _hidl_request.enforceInterface("android.hidl.base@1.0::IBase");
                    notifySyspropsChanged();
                    return;
                default:
                    return;
            }
        }
    }

    IHwBinder asBinder();

    DebugInfo getDebugInfo() throws RemoteException;

    void getFontEnable(getFontEnableCallback getfontenablecallback) throws RemoteException;

    void getFontType(getFontTypeCallback getfonttypecallback) throws RemoteException;

    ArrayList<byte[]> getHashChain() throws RemoteException;

    void getMqMode(getMqModeCallback getmqmodecallback) throws RemoteException;

    ArrayList<String> interfaceChain() throws RemoteException;

    String interfaceDescriptor() throws RemoteException;

    boolean linkToDeath(DeathRecipient deathRecipient, long j) throws RemoteException;

    void notifySyspropsChanged() throws RemoteException;

    void ping() throws RemoteException;

    int setFontEffect(WatchFontEffectConfig watchFontEffectConfig) throws RemoteException;

    int setFontEnable(boolean z) throws RemoteException;

    int setFontPosition(WatchFontPositionConfig watchFontPositionConfig) throws RemoteException;

    int setFontProperty(WatchFontPropertyConfig watchFontPropertyConfig) throws RemoteException;

    int setFontType(WatchFontTypeSliceInfoConfig watchFontTypeSliceInfoConfig) throws RemoteException;

    void setHALInstrumentation() throws RemoteException;

    int setMqMode(MarqueeModeConfig marqueeModeConfig) throws RemoteException;

    int setTimeSync(WatchTimeSyncConfig watchTimeSyncConfig) throws RemoteException;

    boolean unlinkToDeath(DeathRecipient deathRecipient) throws RemoteException;

    static IAodView asInterface(IHwBinder binder) {
        if (binder == null) {
            return null;
        }
        IHwInterface iface = binder.queryLocalInterface(kInterfaceName);
        if (iface != null && (iface instanceof IAodView)) {
            return (IAodView) iface;
        }
        IAodView proxy = new Proxy(binder);
        try {
            for (String descriptor : proxy.interfaceChain()) {
                if (descriptor.equals(kInterfaceName)) {
                    return proxy;
                }
            }
        } catch (RemoteException e) {
        }
        return null;
    }

    static IAodView castFrom(IHwInterface iface) {
        return iface == null ? null : asInterface(iface.asBinder());
    }

    static IAodView getService(String serviceName) throws RemoteException {
        return asInterface(HwBinder.getService(kInterfaceName, serviceName));
    }

    static IAodView getService() throws RemoteException {
        return asInterface(HwBinder.getService(kInterfaceName, "default"));
    }
}

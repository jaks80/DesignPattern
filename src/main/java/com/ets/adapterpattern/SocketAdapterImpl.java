package com.ets.adapterpattern;

/**
 *
 * @author yusufakhond
 */
public class SocketAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get220Volt() {
        return getVolt();
    }

    @Override
    public Volt get110Volt() {
        return convertVolt(getVolt(), 2);
    }

    public Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}

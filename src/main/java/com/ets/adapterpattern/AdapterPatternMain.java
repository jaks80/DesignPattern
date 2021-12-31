package com.ets.adapterpattern;

/**
 *
 * @author yusufakhond
 */
public class AdapterPatternMain {
    public static void main(String[] args) {
        SocketAdapter adapter = new SocketAdapterImpl();
        
        Volt _220V = adapter.get220Volt();
        Volt _110V = adapter.get110Volt();
        
        System.out.println("220 volt:"+_220V.getVolts());
        System.out.println("110 volt:"+_110V.getVolts());
    }
    

}

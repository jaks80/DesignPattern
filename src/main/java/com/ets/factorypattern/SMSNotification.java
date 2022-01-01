
package com.ets.factorypattern;

/**
 *
 * @author yusufakhond
 */
public class SMSNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending SMS message....");
    }
    
}

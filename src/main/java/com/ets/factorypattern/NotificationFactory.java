package com.ets.factorypattern;

/**
 *
 * @author yusufakhond
 */
public class NotificationFactory {
    
    public Notification sendNotification(String communicationProtocol){
        
        switch(communicationProtocol){
            case "SMS":
                return new SMSNotification();
            case "Email":
                return new EmailNotification();
            case "Push":
                return new PushNotification();
        }
        
        return null;
    }
}

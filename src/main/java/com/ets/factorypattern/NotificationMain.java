package com.ets.factorypattern;

/**
 *
 * @author yusufakhond
 */
public class NotificationMain {
 
    public static void main(String[] args) {
      NotificationFactory factory = new NotificationFactory();
      Notification notification = factory.sendNotification("Email");
      notification.notifyUser();
    }
}

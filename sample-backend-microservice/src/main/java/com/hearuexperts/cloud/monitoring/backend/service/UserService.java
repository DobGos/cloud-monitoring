package com.hearuexperts.cloud.monitoring.backend.service;

import com.hearuexperts.cloud.monitoring.backend.domain.User;
import com.hearuexperts.cloud.monitoring.backend.domain.UserStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by dobs on 26/05/17.
 */
@Service
public class UserService {

    public List<User> getUsers() {

        simulateDatabaseInteraction(100, 2000);

        List<User> users = new ArrayList<>(20);
        users.add(new User(UUID.randomUUID().toString(), "Javier", "Manzanares", UserStatus.SUSPENDED, LocalDate.now()));
        users.add(new User(UUID.randomUUID().toString(), "Jaime", "Manzanares", UserStatus.ACTIVE, LocalDate.now()));
        users.add(new User(UUID.randomUUID().toString(), "Javier", "Carlos", UserStatus.DELETED, LocalDate.now()));
        users.add(new User(UUID.randomUUID().toString(), "John", "Smith", UserStatus.SUSPENDED, LocalDate.now()));
        users.add(new User(UUID.randomUUID().toString(), "Bob", "The Builder", UserStatus.SUSPENDED, LocalDate.now()));
        users.add(new User(UUID.randomUUID().toString(), "Master", "Bill", UserStatus.ACTIVE, LocalDate.now()));
        users.add(new User(UUID.randomUUID().toString(), "Igor", "The Great", UserStatus.ACTIVE, LocalDate.now()));
        users.add(new User(UUID.randomUUID().toString(), "Sima", "Mana", UserStatus.ACTIVE, LocalDate.now()));
        users.add(new User(UUID.randomUUID().toString(), "Alan", "Junior", UserStatus.DELETED, LocalDate.now()));
        users.add(new User(UUID.randomUUID().toString(), "David", "Sunares", UserStatus.SUSPENDED, LocalDate.now()));
        users.add(new User(UUID.randomUUID().toString(), "Yama", "Hakamoto", UserStatus.ACTIVE, LocalDate.now()));
        users.add(new User(UUID.randomUUID().toString(), "Rosina", "Lambada", UserStatus.ACTIVE, LocalDate.now()));
        users.add(new User(UUID.randomUUID().toString(), "Lamb", "Rocking", UserStatus.SUSPENDED, LocalDate.now()));
        users.add(new User(UUID.randomUUID().toString(), "Lima", "Beta", UserStatus.DELETED, LocalDate.now()));
        users.add(new User(UUID.randomUUID().toString(), "Franko", "Sumit", UserStatus.ACTIVE, LocalDate.now()));
        users.add(new User(UUID.randomUUID().toString(), "Peter", "Augusta", UserStatus.ACTIVE, LocalDate.now()));
        users.add(new User(UUID.randomUUID().toString(), "Delta", "Cobra", UserStatus.SUSPENDED, LocalDate.now()));
        users.add(new User(UUID.randomUUID().toString(), "Mass", "Media", UserStatus.ACTIVE, LocalDate.now()));
        users.add(new User(UUID.randomUUID().toString(), "Shuma", "Gonzales", UserStatus.DELETED, LocalDate.now()));
        users.add(new User(UUID.randomUUID().toString(), "Lucia", "Gama", UserStatus.ACTIVE, LocalDate.now()));
        return users;
    }

    private void simulateDatabaseInteraction(long minDelayMS, long maxDelayMS) {
        //Simulate DB connectivity
        long sleepTime = Math.max(minDelayMS, (long) (Math.random()*maxDelayMS));//sleep between minDelayMS and maxDelayMS to simulate DB interaction
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

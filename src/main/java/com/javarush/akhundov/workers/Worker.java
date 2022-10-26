package com.javarush.akhundov.workers;

import com.javarush.akhundov.services.AbstractService;

public class Worker implements Runnable{
    AbstractService service;

    public Worker(AbstractService service){
        this.service = service;
    }

    @Override
    public void run() {
        service.runService();
    }
}

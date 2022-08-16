package com.training.spring.configprop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "application.prop")
public class ApplicationProperties {
    
    private String version;
    private String name;
    private String description;
    private int build;
    private long cycle;
    private String gitCommit;
    private int listenPort;
    private List<String> cities;
    private Map<String,City> cityMap;
    private List<City> cityList;
    private City defaultCity;

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public Map<String, City> getCityMap() {
        return cityMap;
    }

    public void setCityMap(Map<String, City> cityMap) {
        this.cityMap = cityMap;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    public City getDefaultCity() {
        return defaultCity;
    }

    public void setDefaultCity(City defaultCity) {
        this.defaultCity = defaultCity;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBuild() {
        return build;
    }

    public void setBuild(int build) {
        this.build = build;
    }

    public long getCycle() {
        return cycle;
    }

    public void setCycle(long cycle) {
        this.cycle = cycle;
    }

    public String getGitCommit() {
        return gitCommit;
    }

    public void setGitCommit(String gitCommit) {
        this.gitCommit = gitCommit;
    }

    public int getListenPort() {
        return listenPort;
    }

    public void setListenPort(int listenPort) {
        this.listenPort = listenPort;
    }

    @Override
    public String toString() {
        return "ApplicationProperties{" +
                "version='" + version + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", build=" + build +
                ", cycle=" + cycle +
                ", gitCommit='" + gitCommit + '\'' +
                ", listenPort=" + listenPort +
                ", cities=" + cities +
                ", cityMap=" + cityMap +
                ", cityList=" + cityList +
                ", defaultCity=" + defaultCity +
                '}';
    }
}


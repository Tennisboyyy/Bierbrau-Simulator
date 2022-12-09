package com.bierbrau.settings;

import org.tools.fileconfiguration.ConfigurationType;
import org.tools.fileconfiguration.FileConfiguration;

import java.io.File;

public class Settings {

    private double musicVolume;
    private double soundVolume;
    private int autoSaveIntervall;

    public Settings() {
        this.musicVolume = 1;
        this.soundVolume = 1;
        this.autoSaveIntervall = 10;
        File settingsFile = new File("data/settings.bbs");
        if(!settingsFile.exists()) {
            FileConfiguration configuration = new FileConfiguration(settingsFile, ConfigurationType.KEYTOVALUE);
            configuration.set("musicvolume", musicVolume);
            configuration.set("soundvolume", soundVolume);
            configuration.set("autosave", autoSaveIntervall);
            configuration.saveConfiguration(settingsFile);
        }
    }

    public void loadSettings() {
        File settingsFile = new File("data/settings.bbs");
        FileConfiguration configuration = new FileConfiguration(settingsFile, ConfigurationType.KEYTOVALUE);
        this.musicVolume = configuration.getDouble("musicvolume");
        this.soundVolume = configuration.getDouble("soundvolume");
        this.autoSaveIntervall = configuration.getInt("autosave");
    }

    public double getMusicVolume() {
        return musicVolume;
    }

    public double getSoundVolume() {
        return soundVolume;
    }

    public int getAutoSaveIntervall() {
        return autoSaveIntervall;
    }

    public void setMusicVolume(double musicVolume) {
        this.musicVolume = musicVolume;
    }

    public void setSoundVolume(double soundVolume) {
        this.soundVolume = soundVolume;
    }

    public void setAutoSaveIntervall(int autoSaveIntervall) {
        this.autoSaveIntervall = autoSaveIntervall;
    }
}

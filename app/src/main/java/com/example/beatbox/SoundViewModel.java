package com.example.beatbox;

public class SoundViewModel {
    private Sound mSound;
    private BeatBox mBeatBox;
    public SoundViewModel(BeatBox beatBox) {
        mBeatBox = beatBox;
    }
    public Sound getSound() {
        return mSound;
    }
    public String getTitle() {
        return mSound.getName();
    }
    public void setSound(Sound sound) {
        mSound = sound;
    }

   public void onButtonClick(){
        mBeatBox.play(mSound);
    }
}

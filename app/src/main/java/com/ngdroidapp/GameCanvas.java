package com.ngdroidapp;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import istanbul.gamelab.ngdroid.base.BaseCanvas;
import istanbul.gamelab.ngdroid.util.Log;
import istanbul.gamelab.ngdroid.util.Utils;


/**
 * Created by noyan on 24.06.2016.
 * Nitra Games Ltd.
 */


public class GameCanvas extends BaseCanvas {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");
    private Bitmap logo;
    private int logox, logoy, logow, logoh;


    public GameCanvas(NgApp ngApp) {
        super(ngApp);
    }

    public void setup() {
        Log.i(TAG, "setup");

        logo = Utils.loadImage(root,"gamelab-istanbul_logo.png");
        logow = logo.getWidth();
        logoh = logo.getHeight();
    }

    public void update() {
        Log.i(TAG, "update");
    }

    public void draw(Canvas canvas) {
        Log.i(TAG, "draw");

        logox = (getWidth() - logow) / 2;
        logoy = (getHeight() - logoh) / 2;
        canvas.drawBitmap(logo, logox, logoy, null);
    }

    public void keyPressed(int key) {

    }

    public void keyReleased(int key) {

    }

    public boolean backPressed() {
        return true;
    }

    public void surfaceChanged(int width, int height) {

    }

    public void surfaceCreated() {

    }

    public void surfaceDestroyed() {

    }

    public void touchDown(int x, int y, int id) {
    }

    public void touchMove(int x, int y, int id) {
    }

    public void touchUp(int x, int y, int id) {
    }


    public void pause() {

    }


    public void resume() {

    }


    public void reloadTextures() {

    }


    public void showNotify() {
    }

    public void hideNotify() {
    }

}

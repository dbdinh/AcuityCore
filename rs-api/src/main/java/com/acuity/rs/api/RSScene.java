package com.acuity.rs.api;

//Generated

public interface RSScene {

    com.acuity.rs.api.RSSceneElement[] getElements();

    com.acuity.rs.api.RSSceneTile[][][] getTiles();

    void invokeGroundObjectSpawned(int var0, int var1, int var2, int var3, RSRenderable var4, int var5, int var6);
}
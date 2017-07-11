package com.acuity.rs.api;


//Generated by the injector on run.

//Extends com/acuity/rs/api/RSCacheableNode
public interface RSSceneElementComposite extends RSCacheableNode {

	java.lang.String[] getActions();

	int getAmbient();

	int getAmbientSoundId();

	int getAnimationId();

	int getClipType();

	short[] getColors();

	int getContrast();

	int getID();

	int getMapIconID();

	int getMapSceneId();

	int getModelHeight();

	int getModelSizeX();

	int getModelSizeY();

	java.lang.String getName();

	short[] getNewColors();

	short[] getNewTextures();

	int getOffsetX();

	int getOffsetY();

	int getOffsetZ();

	com.acuity.rs.api.RS3CopiedNodeTable getProperties();

	int getSizeX();

	int getSizeY();

	short[] getTextures();

	int[] getTransformIDs();

	int getVarpbitIndex();

	int getVarpIndex();

	com.acuity.api.rs.wrappers.peers.composite.SceneElementComposite getWrapper();

	boolean isClipped();

	boolean isClipped1();

	boolean isRotated();

	boolean isSolid();

	void setActions(java.lang.String[] var0);

	void setAmbient(int var0);

	void setAmbientSoundId(int var0);

	void setAnimationId(int var0);

	void setClipped(boolean var0);

	void setClipped1(boolean var0);

	void setClipType(int var0);

	void setColors(short[] var0);

	void setContrast(int var0);

	void setID(int var0);

	void setMapIconID(int var0);

	void setMapSceneId(int var0);

	void setModelHeight(int var0);

	void setModelSizeX(int var0);

	void setModelSizeY(int var0);

	void setName(java.lang.String var0);

	void setNewColors(short[] var0);

	void setNewTextures(short[] var0);

	void setOffsetX(int var0);

	void setOffsetY(int var0);

	void setOffsetZ(int var0);

	void setProperties(com.acuity.rs.api.RS3CopiedNodeTable var0);

	void setRotated(boolean var0);

	void setSizeX(int var0);

	void setSizeY(int var0);

	void setSolid(boolean var0);

	void setTextures(short[] var0);

	void setTransformIDs(int[] var0);

	void setVarpbitIndex(int var0);

	void setVarpIndex(int var0);

	void setWrapper(com.acuity.api.rs.wrappers.peers.composite.SceneElementComposite var0);
}

package com.acuity.rs.api;


//Generated by the injector on run.

//Abstract
//Extends com/acuity/rs/api/RSRenderable
public interface RSActor extends RSRenderable {

	int getActionFrame();

	int getAnimation();

	com.acuity.rs.api.RSNodeLinkedList getHealthBars();

	byte getHitsplatCount();

	int[] getHitsplatCycles();

	int[] getHitsplatIDs();

	int[] getHitsplats();

	int getIdlePoseAnimationID();

	int getOrientation();

	int getPathQueueSize();

	int[] getPathXQueue();

	int[] getPathYQueue();

	int getPoseAnimationID();

	int[] getSpecialHitsplats();

	int getStrictX();

	int getStrictY();

	int getSubAnimationFrame();

	int getTargetIndex();

	void setActionFrame(int var0);

	void setAnimation(int var0);

	void setHealthBars(com.acuity.rs.api.RSNodeLinkedList var0);

	void setHitsplatCount(byte var0);

	void setHitsplatCycles(int[] var0);

	void setHitsplatIDs(int[] var0);

	void setHitsplats(int[] var0);

	void setIdlePoseAnimationID(int var0);

	void setOrientation(int var0);

	void setPathQueueSize(int var0);

	void setPathXQueue(int[] var0);

	void setPathYQueue(int[] var0);

	void setPoseAnimationID(int var0);

	void setSpecialHitsplats(int[] var0);

	void setStrictX(int var0);

	void setStrictY(int var0);

	void setSubAnimationFrame(int var0);

	void setTargetIndex(int var0);
}

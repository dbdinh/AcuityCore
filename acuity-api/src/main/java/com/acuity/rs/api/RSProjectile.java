package com.acuity.rs.api;


//Generated by the injector on run.

public interface RSProjectile extends RSRenderable {

	com.acuity.rs.api.RSAnimationSequence getAnimationSequence();

	double getCurrentY();

	int getCycle();

	int getFloor();

	int getHeight();

	double getHeightOffset();

	int getID();

	int getInteracting();

	int getSlope();

	double getSpeedX();

	double getSpeedY();

	int getStartTime();

	int getStrictX();

	int getStrictY();

	int getTargetDistance();

	double getVelocityX();

	double getVelocityY();

	double getVelocityZ();

	int getXRotation();

	int getYRotation();

	double getZ();

	boolean isMoving();

	void setAnimationSequence(com.acuity.rs.api.RSAnimationSequence var0);

	void setCurrentY(double var0);

	void setCycle(int var0);

	void setFloor(int var0);

	void setHeight(int var0);

	void setHeightOffset(double var0);

	void setID(int var0);

	void setInteracting(int var0);

	void setMoving(boolean var0);

	void setSlope(int var0);

	void setSpeedX(double var0);

	void setSpeedY(double var0);

	void setStartTime(int var0);

	void setStrictX(int var0);

	void setStrictY(int var0);

	void setTargetDistance(int var0);

	void setVelocityX(double var0);

	void setVelocityY(double var0);

	void setVelocityZ(double var0);

	void setXRotation(int var0);

	void setYRotation(int var0);

	void setZ(double var0);
}

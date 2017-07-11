package com.acuity.rs.api;


//Generated by the injector on run.

//Extends com/acuity/rs/api/RSRenderable
public interface RSModelComposite extends RSRenderable {

	byte getPriority();

	int[] getVertexX();

	int[] getVertexY();

	int[] getVertexZ();

	com.acuity.rs.api.RSModel invokeLight(int var0, int var1, int var2, int var3, int var4);

	void setPriority(byte var0);

	void setVertexX(int[] var0);

	void setVertexY(int[] var0);

	void setVertexZ(int[] var0);
}

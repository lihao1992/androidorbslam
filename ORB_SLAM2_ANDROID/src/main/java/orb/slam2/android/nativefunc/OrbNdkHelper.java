package orb.slam2.android.nativefunc;

import android.content.res.AssetManager;

public class OrbNdkHelper {
	
	/**
	 * jni中初始化SLAM系统
	 * @param VOCPath
	 * @param calibrationPath
	 */
	public static native void initSystemWithParameters(String VOCPath,String calibrationPath);
	
	public static native int[] startCurrentORB(double curTimeStamp,int[] data,int w,int h);
	public native static int[] startCurrentORBForCamera(double curTimeStamp,long addr,int w,int h);
	public native static void glesInit();  
    public native static void glesRender();  
    public native static void glesResize(int width, int height);

}

#include <jni.h>
#include "D:\nitin\sample\NativeDemo.h"
#include <iostream>
using namespace std;
JNIEXPORT jstring JNICALL Java_NativeDemo_greet1
  (JNIEnv *p, jobject q)
{
	jstring str;
	char val[]="Good Morning";
	str=p->NewStringUTF(val);
	return str;
}


JNIEXPORT void JNICALL Java_NativeDemo_greet2
  (JNIEnv *p, jclass q)
{
	cout<<"Good Afternoon"<<endl;
}

JNIEXPORT jstring JNICALL Java_NativeDemo_greet3
  (JNIEnv *p, jobject q)
{
	jstring str;
	char val[]="Good Night";
	str=p->NewStringUTF(val);
	return str;
}







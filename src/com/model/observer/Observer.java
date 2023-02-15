package com.model.observer;

import com.vue.*;

public abstract class Observer {
	protected ConvertView subject;
	public abstract void update();
}

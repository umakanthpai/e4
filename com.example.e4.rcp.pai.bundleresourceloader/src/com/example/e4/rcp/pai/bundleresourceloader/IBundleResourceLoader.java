package com.example.e4.rcp.pai.bundleresourceloader;

import org.eclipse.swt.graphics.Image;

public interface IBundleResourceLoader {
	public Image loadImage(Class<?> clazz, String path);
}

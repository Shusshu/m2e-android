package me.gladwell.eclipse.m2e.android.project;

public interface AndroidProjectFactory<T, CONTEXT> {

	T createAndroidProject(CONTEXT target);

}
package test;

import io.netty.util.internal.PlatformDependent;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class AtomicReferenceFieldUpdaterTest {
	public static void main(String[] args) throws Exception {
		AtomicReferenceFieldUpdater updater = PlatformDependent.newAtomicReferenceFieldUpdater(Dog.class, "name");
		Dog dog1 = new Dog();
		updater.compareAndSet(dog1, dog1.name, "test");
		System.out.println(dog1.name);
	}
}

class Dog {
	volatile String name = "dog1";

}
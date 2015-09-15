package net.stickycode.mockwire.guice3;

import net.stickycode.bootstrap.StickyBootstrap;
import net.stickycode.mockwire.MockwireFrameworkBridge;

public class Guice3MockwireFrameworkBridge
    implements MockwireFrameworkBridge {

  @Override
  public void initialise(StickyBootstrap bootstrap, Class<?> metadata) {
    bootstrap.extend(new IsolatedTestModule(metadata));
  }

}

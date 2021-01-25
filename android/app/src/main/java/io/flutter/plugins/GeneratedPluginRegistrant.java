package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import dev.asdevs.signalr_flutter.SignalRFlutterPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    SignalRFlutterPlugin.registerWith(registry.registrarFor("dev.asdevs.signalr1.SignalRFlutterPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}

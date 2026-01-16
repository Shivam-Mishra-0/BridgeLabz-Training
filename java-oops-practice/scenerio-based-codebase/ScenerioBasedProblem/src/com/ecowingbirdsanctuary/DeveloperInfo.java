package com.ecowingbirdsanctuary;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface DeveloperInfo {
    String name();
    String version();
}
package com.example.tipstricks;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("staging")
public class StagingInitializer {

}

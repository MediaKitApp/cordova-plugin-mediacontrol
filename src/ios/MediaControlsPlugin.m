#import "AudioTogglePlugin.h"
#import <AudioToolbox/AudioToolbox.h>
#import <AVFoundation/AVFoundation.h>

@implementation MediaControlsPlugin

- (void)setModeAudio:(CDVInvokedUrlCommand *)command
{
    NSError* __autoreleasing err = nil;
    NSString* mode = [NSString stringWithFormat:@"%@", [command.arguments objectAtIndex:0]];
    
    UInt32 audioRouteOverride = kAudioSessionOverrideAudioRoute_None;
    AVAudioSession *session = [AVAudioSession sharedInstance];
    
    if ([mode isEqualToString:@"speaker"]) {
        [session setCategory:AVAudioSessionCategoryPlayAndRecord withOptions:AVAudioSessionCategoryOptionDefaultToSpeaker error:nil];
    } else {
        [session setCategory:AVAudioSessionCategorySoloAmbient error:&err];
    }
    
}

@end

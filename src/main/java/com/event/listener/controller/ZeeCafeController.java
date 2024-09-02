package com.event.listener.controller;

import com.event.listener.model.request.ZeeCafeEventRequest;
import com.event.listener.publisher.ZeeCafePublisher;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class ZeeCafeController {

    private final ZeeCafePublisher zeeCafePublisher;

    @PostMapping("/bbt-stream")
    public String streamingBBT(@RequestBody ZeeCafeEventRequest zeeCafeEventRequest){
        zeeCafePublisher.streamBigBangTheory(zeeCafeEventRequest.getEpisodeNo());
        return "BBT is streaming now";
    }

    @PostMapping("/cs-stream")
    public String streamingComedyShow(@RequestBody ZeeCafeEventRequest zeeCafeEventRequest){
        zeeCafePublisher.streamComedyShow(zeeCafeEventRequest.getEpisodeNo());
        return "Comedy show is streaming now";
    }
}

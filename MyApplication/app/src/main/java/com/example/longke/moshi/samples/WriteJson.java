/*
 * Copyright (C) 2015 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.longke.moshi.samples;

import com.example.longke.moshi.samples.models.BlackjackHand;
import com.example.longke.moshi.samples.models.Card;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.util.Arrays;

import static com.example.longke.moshi.samples.models.Suit.CLUBS;
import static com.example.longke.moshi.samples.models.Suit.HEARTS;
import static com.example.longke.moshi.samples.models.Suit.SPADES;

public final class WriteJson {
  public void run() throws Exception {
    BlackjackHand blackjackHand = new BlackjackHand(
        new Card('6', SPADES),
        Arrays.asList(new Card('4', CLUBS), new Card('A', HEARTS)));

    Moshi moshi = new Moshi.Builder().build();
    JsonAdapter<BlackjackHand> jsonAdapter = moshi.adapter(BlackjackHand.class);

    String json = jsonAdapter.toJson(blackjackHand);
    System.out.println(json);
  }

  public static void main(String[] args) throws Exception {
    new WriteJson().run();
  }
}

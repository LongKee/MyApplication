/*
 * Copyright (C) 2016 Square, Inc.
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

import com.example.longke.moshi.samples.models.Player;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

public final class CustomFieldName {
  public void run() throws Exception {
    String json = ""
        + "{"
        + "  \"username\": \"jesse\","
        + "  \"lucky number\": 32"
        + "}\n";

    Moshi moshi = new Moshi.Builder().build();
    JsonAdapter<Player> jsonAdapter = moshi.adapter(Player.class);

    Player player = jsonAdapter.fromJson(json);
    System.out.println(player);
  }

  public static void main(String[] args) throws Exception {
    new CustomFieldName().run();
  }
}

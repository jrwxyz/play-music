# play-music
Analysis and Prediction about music.

### 数据类型说明
- 用户行为表

|     列名    | 类型   |                  说明                    |             示例                 |
| ----------- |:-----: | ---------------------------------------- | -------------------------------- |
| user_id     | String | 用户唯一标识                             | 7063b3d0c075a4d276c5f06f4327cf4a |
| song_id     | String | 歌曲唯一标识                             | effb071415be51f11e845884e67c0f8c |
| gmt_create  | String | 用户播放时间（unix时间戳表示）精确到小时 | 1426406400                       |
| action_type | String | 行为类型：1，播放；2，下载，3，收藏      | 1                                |
| Ds          | String | 记录收集日（分区）                       | 20150315                         |

- 歌曲艺人表

|     列名        | 类型   |                  说明                  |             示例                 |
| --------------  |:-----: | -------------------------------------- | -------------------------------- |
| song_id         | String | 歌曲唯一标识                           | c81f89cf7edd24930641afa2e411b09c |
| artist_id       | String | 歌曲所属的艺人Id                       | 03c6699ea836decbc5c8fc2dbae7bd3b |
| publish_time    | String | 歌曲发行时间，精确到天                 | 20150325                         |
| song_init_plays | String | 歌曲的初始播放数，表明该歌曲的初始热度 | 0                                |
| Language        | String | 数字表示1,2,3…                        | 100                              |
| Gender          | String | 1,2,3(分别代表男,女,团队)              | 1                                |

- 提交结果表(需要预测9月1日至10月30日60天内所有艺人的结果,文件命名方式：mars_tianchi_artist_plays_predict.csv)

|     列名  | 类型   |       说明         |             示例                 |
| --------- |:-----: | ------------------ | -------------------------------- |
| artist_id | String | 歌曲所属的艺人Id   | 023406156015ef87f99521f3b343f71f |
| Plays     | String | 艺人当天的播放数据 | 5000                             |
| Ds        | String | 日期               | 20150901                         |

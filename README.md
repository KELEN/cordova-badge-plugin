# cordova-badge-plugin

## 基于 [ShortcutBadger] (https://github.com/leolin310148/ShortcutBadger) 封装cordova插件

## 支持机型

![支持机型]()

# 使用

### 安装

1. `cordova plugin add 插件路径`

2. `cordova build`

3. 在html页面引入

`
	document.addEventListener("deviceready",function() {
        document.getElementById("settingBtn").onclick = function() {
            BadgePlugin.set(20, function(err, res) {
                if (!err) {
                    alert("设置成功");
                }
            })
        }
        document.getElementById("clearBtn").onclick = function() {
            BadgePlugin.clear(function(err, res) {
                if (err) {
                    alert("设置失败")
                }
            })
        }
    },false);
`




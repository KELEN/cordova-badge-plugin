# cordova-badge-plugin

### 基于 [ShortcutBadger](https://github.com/leolin310148/ShortcutBadger) 封装cordova插件

### 支持机型

![支持机型](https://raw.githubusercontent.com/KELEN/cordova-badge-plugin/master/support-launchers.png)

# 使用

### 安装

1. `cordova plugin add https://github.com/leecrossley/cordova-plugin-social-message.git`

2. `cordova build`

3. 在html页面引入

```javascript
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
```


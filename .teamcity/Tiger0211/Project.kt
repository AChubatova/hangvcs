package Tiger0211

import Tiger0211.buildTypes.*
import Tiger0211.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0211")
    name = "Tiger0211"

    vcsRoot(Tiger0211_cVCSroot)

    buildType(Tiger0211_Hi3)
    buildType(Tiger0211_Hi1)
    buildType(Tiger0211_Hi2)
    buildType(Tiger0211_Hi0)
})

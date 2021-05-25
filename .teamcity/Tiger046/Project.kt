package Tiger046

import Tiger046.buildTypes.*
import Tiger046.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger046")
    name = "Tiger046"

    vcsRoot(Tiger046_cVCSroot)

    buildType(Tiger046_Hi3)
    buildType(Tiger046_Hi1)
    buildType(Tiger046_Hi2)
    buildType(Tiger046_Hi0)
})

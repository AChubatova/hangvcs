package Tiger0210

import Tiger0210.buildTypes.*
import Tiger0210.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0210")
    name = "Tiger0210"

    vcsRoot(Tiger0210_cVCSroot)

    buildType(Tiger0210_Hi0)
    buildType(Tiger0210_Hi1)
    buildType(Tiger0210_Hi2)
    buildType(Tiger0210_Hi3)
})

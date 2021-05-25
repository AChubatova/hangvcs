package Tiger0219

import Tiger0219.buildTypes.*
import Tiger0219.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0219")
    name = "Tiger0219"

    vcsRoot(Tiger0219_cVCSroot)

    buildType(Tiger0219_Hi3)
    buildType(Tiger0219_Hi1)
    buildType(Tiger0219_Hi2)
    buildType(Tiger0219_Hi0)
})

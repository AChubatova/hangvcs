package Tiger003

import Tiger003.buildTypes.*
import Tiger003.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger003")
    name = "Tiger003"

    vcsRoot(Tiger003_cVCSroot)

    buildType(Tiger003_Hi0)
    buildType(Tiger003_Hi1)
    buildType(Tiger003_Hi2)
    buildType(Tiger003_Hi3)
})

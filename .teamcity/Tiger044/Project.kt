package Tiger044

import Tiger044.buildTypes.*
import Tiger044.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger044")
    name = "Tiger044"

    vcsRoot(Tiger044_cVCSroot)

    buildType(Tiger044_Hi1)
    buildType(Tiger044_Hi2)
    buildType(Tiger044_Hi0)
    buildType(Tiger044_Hi3)
})

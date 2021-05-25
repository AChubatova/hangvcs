package Tiger042

import Tiger042.buildTypes.*
import Tiger042.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger042")
    name = "Tiger042"

    vcsRoot(Tiger042_cVCSroot)

    buildType(Tiger042_Hi0)
    buildType(Tiger042_Hi2)
    buildType(Tiger042_Hi1)
    buildType(Tiger042_Hi3)
})
